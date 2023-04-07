package org.musictheorist.mother3hqaudiopatcher.rom.sound.engine;

final class InvalidCpuSetException extends IllegalArgumentException {
    @Override
    public String getLocalizedMessage() {
        return "errorInvalidCpuSet";
    }
}
