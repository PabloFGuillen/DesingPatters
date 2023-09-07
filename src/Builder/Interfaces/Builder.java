package Builder.Interfaces;

public interface Builder {
    void setRam(int Ram);

    void setPuertosUsb(int puertos);

    void hasNFC(boolean nfc);

    void bateria(int amperios);

    void tipoDispositivo(TipoOrdenador ordenador);
}
