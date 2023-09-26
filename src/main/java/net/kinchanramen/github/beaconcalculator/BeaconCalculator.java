package net.kinchanramen.github.beaconcalculator;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeaconCalculator implements ModInitializer {
    public static final String MOD_ID="BeaconCalculator";
    public static Logger logger;
    @Override
    public void onInitialize() {
        logger = LoggerFactory.getLogger(MOD_ID);
        logger.info("-- Calculator --");
    }
}
