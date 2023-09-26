package net.kinchanramen.github.beaconcalculator.client;
import com.mojang.brigadier.CommandDispatcher;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.kinchanramen.github.beaconcalculator.command.BeaconCalculatorCommand;
import net.minecraft.command.CommandRegistryAccess;

public class BeaconCalculatorClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientCommandRegistrationCallback.EVENT.register(this::registerCommands);
    }

    private void registerCommands(CommandDispatcher<FabricClientCommandSource> dispatcher, CommandRegistryAccess commandRegistryAccess) {
        BeaconCalculatorCommand.register(dispatcher);
    }
}
