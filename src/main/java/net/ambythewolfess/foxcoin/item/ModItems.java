package net.ambythewolfess.foxcoin.item;

import net.ambythewolfess.foxcoin.FoxCoin;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FoxCoin.MOD_ID);

    public static final DeferredItem<Item> COPPERCOIN = ITEMS.register("coppercoin",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVERCOIN = ITEMS.register("silvercoin",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLDCOIN = ITEMS.register("goldcoin",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSEGOLDCOIN = ITEMS.register("rosegoldcoin",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUMCOIN = ITEMS.register("platinumcoin",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERITECOIN = ITEMS.register("netheritecoin",
            ()-> new Item(new Item.Properties()));


    public static final DeferredItem<Item> RAWSILVER = ITEMS.register("rawsilver",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAWPLATINUM = ITEMS.register("rawplatinum",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAWROSEGOLD = ITEMS.register("rawrosegold",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SILVERINGOT = ITEMS.register("silveringot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSEGOLDINGOT = ITEMS.register("rosegoldingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUMINGOT = ITEMS.register("platinumingot",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SILVERNUGGET = ITEMS.register("silvernugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSEGOLDNUGGET = ITEMS.register("rosegoldnugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUMNUGGET = ITEMS.register("platinumnugget",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ROSEGOLDCARROT = ITEMS.register("rosegoldcarrot",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ROSEGOLDCARROT)));

    public static final DeferredItem<Item> ROSEGOLDAPPLE = ITEMS.register("rosegoldapple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ROSEGOLDAPPLE)));

    public static final DeferredItem<Item> ENCHANTEDROSEGOLDAPPLE = ITEMS.register("enchantedrosegoldapple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ENCHANTEDROSEGOLDCARROT)){
            @Override
                public boolean isFoil(ItemStack stack) {
                return true;
            }
            });


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
