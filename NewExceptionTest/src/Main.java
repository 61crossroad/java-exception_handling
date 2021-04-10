public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println("Error message : " + e.getMessage());
            e.printStackTrace();
            System.out.println("Reserve enough space then try again.");
        } catch (MemoryException me) {
            System.out.println("Error message : " + me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("Try install again.");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace())
            throw new SpaceException("Not enough space");
        if (!enoughMemory())
            throw new MemoryException("Not enough memory");
    }

    static void copyFiles() { /* TODO: write code here */ }
    static void deleteTempFiles() { /* TODO: write code here */ }

    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return true;
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}