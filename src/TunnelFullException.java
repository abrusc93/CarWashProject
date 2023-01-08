public class TunnelFullException extends Exception {

    public TunnelFullException() {
        super("Tunnel is currently at max limit");
    }

    public TunnelFullException(String dat) {
        System.out.println("Tunnel full: " + dat);
    }
}