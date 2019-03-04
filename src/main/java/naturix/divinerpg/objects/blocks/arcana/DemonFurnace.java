package naturix.divinerpg.objects.blocks.arcana;

import naturix.divinerpg.objects.blocks.FurnaceBase;
import naturix.divinerpg.objects.blocks.tile.block.TileEntityDemonFurnace;
import naturix.divinerpg.registry.ModBlocks;
import naturix.divinerpg.utils.GUIHandler;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DemonFurnace extends FurnaceBase implements ITileEntityProvider {
    protected String name;

    public DemonFurnace(String name) {
        super(name, GUIHandler.DEMON_FURNACE_GUI_ID);
        this.name = name;
    }

    public static void setState(boolean active, World worldIn, BlockPos pos) {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        TileEntity tileentity = worldIn.getTileEntity(pos);
        Block block = iblockstate.getBlock();

        if (active) {
            worldIn.setBlockState(pos, ModBlocks.demonFurnace.getDefaultState()
                    .withProperty(FACING, iblockstate.getValue(FACING)).withProperty(BURNING, true), 3);
        } else {
            worldIn.setBlockState(pos, ModBlocks.demonFurnace.getDefaultState()
                    .withProperty(FACING, iblockstate.getValue(FACING)).withProperty(BURNING, false), 3);
        }

        if (tileentity != null) {
            tileentity.validate();
            worldIn.setTileEntity(pos, tileentity);
        }
    }

    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityDemonFurnace();
    }
}