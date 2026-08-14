package net.ambythewolfess.foxcoin.item;

import net.ambythewolfess.foxcoin.FoxCoin;
import net.ambythewolfess.foxcoin.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FoxCoin.MOD_ID);

    public static final Supplier<CreativeModeTab> FOXCOIN = CREATIVE_MODE_TAB.register("kitunecoin_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NETHERITECOIN.get()))
                    .title(Component.translatable("creativetab.foxcoin"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.COPPERCOIN);
                        output.accept(ModItems.SILVERCOIN);
                        output.accept(ModItems.GOLDCOIN);
                        output.accept(ModItems.ROSEGOLDCOIN);
                        output.accept(ModItems.PLATINUMCOIN);
                        output.accept(ModItems.NETHERITECOIN);

                        output.accept(ModItems.SILVERINGOT);
                        output.accept(ModItems.ROSEGOLDINGOT);
                        output.accept(ModItems.PLATINUMINGOT);

                        output.accept(ModItems.SILVERNUGGET);
                        output.accept(ModItems.ROSEGOLDNUGGET);
                        output.accept(ModItems.PLATINUMNUGGET);

                        output.accept(ModItems.RAWSILVER);
                        output.accept(ModItems.RAWROSEGOLD);
                        output.accept(ModItems.RAWPLATINUM);

                        output.accept(ModItems.CRUSHEDRAWSILVER);
                        output.accept(ModItems.CRUSHEDRAWROSEGOLD);
                        output.accept(ModItems.CRUSHEDRAWPLATINUM);

                        output.accept(ModItems.SILVERSHEET);
                        output.accept(ModItems.ROSEGOLDSHEET);
                        output.accept(ModItems.PLATINUMSHEET);
                        output.accept(ModItems.NETHERITESHEET);

                        output.accept(ModItems.ROSEGOLDCARROT);
                        output.accept(ModItems.ROSEGOLDAPPLE);
                        output.accept(ModItems.ENCHANTEDROSEGOLDAPPLE);

                        output.accept(ModBlocks.SILVERBLOCK);
                        output.accept(ModBlocks.ROSEGOLDBLOCK);
                        output.accept(ModBlocks.PLATINUMBLOCK);

                        output.accept(ModBlocks.RAWSILVERBLOCK);
                        output.accept(ModBlocks.RAWROSEGOLDBLOCK);
                        output.accept(ModBlocks.RAWPLATINUMBLOCK);

                        output.accept(ModBlocks.SILVERORE);
                        output.accept(ModBlocks.PLATINUMORE);
                        output.accept(ModBlocks.DEEPSLATESILVERORE);
                        output.accept(ModBlocks.DEEPSLATEPLATINUMORE);

                        output.accept(ModBlocks.CHARCOALBLOCK);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
