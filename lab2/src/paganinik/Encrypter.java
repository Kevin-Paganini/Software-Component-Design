package paganinik;

public interface Encrypter {
    byte[] decrypt(byte[] msg);
    byte[] encrypt(byte[] msg);
}
