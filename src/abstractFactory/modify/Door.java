package abstractFactory.modify;

abstract class Door {
    private DoorStatus doorStatus;

    Door() {
        doorStatus = DoorStatus.CLOSED;
    }

    abstract void doOpen();

    abstract void doClose();

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }

    void open() {
        if(doorStatus == DoorStatus.OPENED)
            return;
        doOpen();
        doorStatus = DoorStatus.OPENED;
    }

    void close() {
        if(doorStatus == DoorStatus.CLOSED)
            return;
        doClose();
        doorStatus = DoorStatus.CLOSED;
    }
}
