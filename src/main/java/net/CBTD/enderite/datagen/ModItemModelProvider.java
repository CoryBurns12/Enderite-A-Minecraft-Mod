package net.CBTD.enderite.datagen;

import net.CBTD.enderite.Enderite;
import net.CBTD.enderite.block.ModBlock;
import net.CBTD.enderite.item.customitems.ModItem;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Enderite.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Basics
        basicItem(ModItem.ENDERITE_INGOT.get());
        basicItem(ModItem.ENDERITE_SCRAP.get());

        // Handhelds
        handHeldItem(ModItem.ENDERITE_SWORD);
        handHeldItem(ModItem.ENDERITE_MACE);
        handHeldItem(ModItem.ENDERITE_PICKAXE);
        handHeldItem(ModItem.ENDERITE_AXE);
        handHeldItem(ModItem.ENDERITE_HOE);

    }

    private ItemModelBuilder handHeldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Enderite.MOD_ID, "item/" + item.getId().getPath()));
    }
}
