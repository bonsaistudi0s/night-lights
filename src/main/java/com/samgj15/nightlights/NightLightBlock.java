package com.samgj15.nightlights;




import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class NightLightBlock extends Block {
	public static final BooleanProperty CLICKED = BooleanProperty.create("clicked");
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	
	public NightLightBlock(Block.Properties properties) {
		super(properties);
	}
	
	private static final VoxelShape SHAPE = Block.box(3, 0, 3, 13, 6, 13);
	
	public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
		 if(!pLevel.isClientSide() && pHand == InteractionHand.MAIN_HAND) {
			 boolean currentState = pState.getValue(CLICKED);
			 pLevel.setBlock(pPos, pState.setValue(CLICKED, !currentState), 3);
			 

	         float f = !pState.getValue(CLICKED) ? 0.6F : 0.5F;
			 pLevel.playSound(null, pPos, (pState.getValue(CLICKED) == true) ? SoundEvents.STONE_BUTTON_CLICK_OFF : SoundEvents.STONE_BUTTON_CLICK_ON, SoundSource.BLOCKS, 0.3F, f);
		 }
		 return InteractionResult.SUCCESS;
	}
	
	public boolean canSurvive(BlockState pState, LevelReader pReader, BlockPos pPos) {
		BlockPos blockpos = pPos.below();
		return canSupportRigidBlock(pReader, blockpos) || canSupportCenter(pReader, blockpos, Direction.UP);
	}
	 
	 @Override
	 public BlockState getStateForPlacement(BlockPlaceContext context) {
		    return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
		}
	 
	 @Override
	    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
	        pBuilder.add(CLICKED);
	        pBuilder.add(FACING);
	    }

	 @Override
	 public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
		 return SHAPE;
	 }


}
