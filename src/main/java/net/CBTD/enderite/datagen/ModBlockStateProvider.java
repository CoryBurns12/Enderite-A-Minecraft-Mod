package net.CBTD.enderite.datagen;

import net.CBTD.enderite.Enderite;
import net.CBTD.enderite.block.ModBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Enderite.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlock.STRANGE_DEBRIS);
    }

    private void blockWithItem(RegistryObject<Block> blockReg) {
        simpleBlockWithItem(blockReg.get(), cubeAll(blockReg.get()));
    }
}
