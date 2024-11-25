package net.CBTD.enderite.block;

import net.CBTD.enderite.Enderite;
import net.CBTD.enderite.item.customitems.ModItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlock {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Enderite.MOD_ID);

    // Block registry
    public static final RegistryObject<Block> STRANGE_DEBRIS = registerBlock("strange_debris",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.ANCIENT_DEBRIS)));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> returnBack = BLOCKS.register(name, block);
        registerBlockItem(name, returnBack);
        return returnBack;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItem.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus event) {
        BLOCKS.register(event);
    }
}
