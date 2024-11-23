package net.CBTD.enderite.util;

import net.CBTD.enderite.Enderite;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import javax.swing.text.html.HTML;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> NEEDS_ENDERITE_TOOL = tagKey("needs_enderite_tool");
        public static final TagKey<Block> INCORRECT_FOR_ENDERITE = tagKey("invalid_tool");

        private static TagKey<Block> tagKey(String tag) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Enderite.MOD_ID, tag));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORM_ITEMS = tagKey("transform_items");

        private static TagKey<Item> tagKey(String tag) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Enderite.MOD_ID, tag));
        }
    }
}
