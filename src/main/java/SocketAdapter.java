public class SocketAdapter extends Socket implements ISocketAdapter{

    @Override
    public Volt get220Volt() {
        return getVolt();
    }

    @Override
    public Volt get127Volt() {
        Volt v= getVolt();
        return convertVolt(v,1.7322);
    }

    @Override
    public Volt get12Volt() {
        Volt v = getVolt();
        return convertVolt(v,18.3333);
    }

    private Volt convertVolt(Volt v, double i) {
        return new Volt(v.getVolts() / i);
    }
}