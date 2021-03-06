package singleton.init;

class UserThread extends Thread {
    UserThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Printer printer = Printer.getPrinter();
        printer.print(Thread.currentThread().getName() + " print using " +
                printer.toString() + ".");
    }
}
