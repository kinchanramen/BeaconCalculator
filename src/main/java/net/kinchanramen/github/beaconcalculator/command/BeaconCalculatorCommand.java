package net.kinchanramen.github.beaconcalculator.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralTextContent;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import static net.fabricmc.fabric.api.client.command.v2.ClientCommandManager.*;


public class BeaconCalculatorCommand {
    public static void register(CommandDispatcher<FabricClientCommandSource> dispatcher) {
        dispatcher.register(literal("beaconCalculator").executes(BeaconCalculatorCommand::Calculator)
        );
}

    private static int Calculator(CommandContext<FabricClientCommandSource> Context) {
        BlockPos playerPos= Context.getSource().getPlayer().getBlockPos();
        String pos="(" + playerPos.getX() + "," + playerPos.getY() + "," + playerPos.getZ() + ")";
        Context.getSource().sendFeedback(Text.literal("マップ左下の座標 "+ pos));
        int migiuex, migiuez, migisitax, migisitaz, hidarisitax, hidarisitaz, hidariuex, hidariuez;
        hidarisitax= playerPos.getX()+50;
        hidarisitaz= playerPos.getZ()-50;
        hidariuex = playerPos.getX()+50;
        hidariuez = playerPos.getZ() - 127+50;
        migiuex = playerPos.getX() + 127-50;
        migiuez = playerPos.getZ()-127+50;
        migisitax = playerPos.getX()+127-50;
        migisitaz = playerPos.getZ()-50;
        Context.getSource().sendFeedback(Text.literal("左上のビーコン:"+hidariuex+","+playerPos.getY()+","+hidariuez+"\n"+"右上のビーコン:"+migiuex+","+playerPos.getY()+","+migiuez+"\n"+"右下のビーコン:"+migisitax+","+playerPos.getY()+","+migisitaz+"\n"+"左下のビーコン:"+hidarisitax+","+playerPos.getY()+","+hidarisitaz));
        /*Context.getSource().sendFeedback(Text.literal("右上のビーコン:"+migiuex+","+playerPos.getY()+","+migiuez));
        Context.getSource().sendFeedback(Text.literal("右下のビーコン:"+migisitax+","+playerPos.getY()+","+migisitaz));
        Context.getSource().sendFeedback(Text.literal("左下のビーコン:"+hidarisitax+","+playerPos.getY()+","+hidarisitaz));*/
        return 0;
    }
}