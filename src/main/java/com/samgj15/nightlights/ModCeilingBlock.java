package com.samgj15.nightlights;

import java.util.Map;

import javax.annotation.Nullable;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

@SuppressWarnings("unused")
public class ModCeilingBlock extends Block{

	public ModCeilingBlock(Properties properties) {
		super(properties);
	}

	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	private static final Map<Direction, VoxelShape> AABBS = Maps.newEnumMap(ImmutableMap.of(Direction.NORTH, Block.box(0, 5, 15, 16, 16, 16), Direction.SOUTH, Block.box(0, 5, 0, 16, 16, 1), Direction.WEST, Block.box(15, 5, 0, 16, 16, 16), Direction.EAST, Block.box(0, 5, 0, 1, 16, 16)));
	
	public VoxelShape getShape(BlockState pState, BlockGetter pGetter, BlockPos pPos, CollisionContext pContext) {
		return getShape(pState);	
	}
	
	public static VoxelShape getShape(BlockState pState) {
		return AABBS.get(pState.getValue(FACING));
	}
	
	public boolean canSurvive(BlockState pState, LevelReader pReader, BlockPos pPos) {
		 BlockPos blockpos = pPos.above();
		 return canSupportRigidBlock(pReader, blockpos) || canSupportCenter(pReader, blockpos, Direction.DOWN) && !pReader.isEmptyBlock(pPos.above());
	 }
	
	@Override
	 public BlockState getStateForPlacement(BlockPlaceContext context) {
		    return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
		}
	
	@SuppressWarnings("deprecation")
	public BlockState updateShape(BlockState p_152926_, Direction p_152927_, BlockState p_152928_, LevelAccessor p_152929_, BlockPos p_152930_, BlockPos p_152931_) {
	      return !p_152926_.canSurvive(p_152929_, p_152930_) ? Blocks.AIR.defaultBlockState() : super.updateShape(p_152926_, p_152927_, p_152928_, p_152929_, p_152930_, p_152931_);
	   }
	
	public BlockState rotate(BlockState p_58140_, Rotation p_58141_) {
		return p_58140_.setValue(FACING, p_58141_.rotate(p_58140_.getValue(FACING)));
	}
	
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_58150_) {
		p_58150_.add(FACING);
	}
}
