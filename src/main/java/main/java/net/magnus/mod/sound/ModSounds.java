package main.java.net.magnus.mod.sound;

import main.java.net.magnus.mod.Mod;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent SCYTHE_SLASH = registerSoundEvent("schythe_slash");
    public static final SoundEvent ENDERITE_SWORD_SLASH = registerSoundEvent("enderite_sword_slash");

    public static final SoundEvent ROMOS_MAGIC_TOUCH = registerSoundEvent("romos_magic_touch");
    public static final RegistryKey<JukeboxSong> ROMOS_MAGIC_TOUCH_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Mod.MOD_ID, "romos_magic_touch"));

    public static final SoundEvent SAD_PAST = registerSoundEvent("sad_past");
    public static final RegistryKey<JukeboxSong> SAD_PAST_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Mod.MOD_ID, "sad_past"));

    public static final SoundEvent NIGHTHAWK_ISOLATION = registerSoundEvent("nighthawk_isolation");
    public static final RegistryKey<JukeboxSong> NIGHTHAWK_ISOLATION_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Mod.MOD_ID, "nighthawk_isolation"));

    public static final SoundEvent LAND_OF_PETALS = registerSoundEvent("land_of_petals");
    public static final RegistryKey<JukeboxSong> LAND_OF_PETALS_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Mod.MOD_ID, "land_of_petals"));

    public static final SoundEvent SHIAWASE_VIP = registerSoundEvent("shiawase_vip");
    public static final RegistryKey<JukeboxSong> SHIAWASE_VIP_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Mod.MOD_ID, "shiawase_vip"));



    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(Mod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        Mod.LOGGER.info("Registering Mod Sounds For Space Exploration " + Mod.MOD_ID);
    }
}
