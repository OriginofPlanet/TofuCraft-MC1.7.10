package tsuteto.tofu.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;
import tsuteto.tofu.block.BlockTofuStep;
import tsuteto.tofu.block.BlockTofuStepFaces;
import tsuteto.tofu.block.BlockTofuStepSimple;

public class ItemTcSlabFaces extends ItemSlab
{
    public ItemTcSlabFaces(Block par1, BlockTofuStep par2BlockHalfSlab, BlockTofuStep par3BlockHalfSlab, Boolean par4) {
        super(par1, par2BlockHalfSlab, par3BlockHalfSlab, par4);
        this.setHasSubtypes(false);
    }

    public ItemTcSlabFaces(Block par1, BlockTofuStepFaces par2BlockHalfSlab, BlockTofuStepFaces par3BlockHalfSlab, Boolean par4) {
        super(par1, par2BlockHalfSlab, par3BlockHalfSlab, par4);
        this.setHasSubtypes(false);
    }

    public ItemTcSlabFaces(Block par1, BlockTofuStepSimple par2BlockHalfSlab, BlockTofuStepSimple par3BlockHalfSlab, Boolean par4) {
        super(par1, par2BlockHalfSlab, par3BlockHalfSlab, par4);
        this.setHasSubtypes(false);
    }

    public int getMetadata(int p_77647_1_)
    {
        return 0;
    }
}
