package de.predic8.f_kstreams;

/**
 * Created by thomas on 26.11.16.
 */
public class Messung {

    public String anlage;
    public String type;
    public double kw;

    public Messung() {
    }

    public Messung(String s) {
        System.out.println("s = " + s);
    }
//
//    public String getAnlage() {
//        return anlage;
//    }
//
//    public void setAnlage(String anlage) {
//        this.anlage = anlage;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public double getKw() {
//        return kw;
//    }
//
//    public void setKw(double kw) {
//        this.kw = kw;
//    }

    @Override
    public String toString() {
        StringBuffer buf = new StringBuffer();
        buf.append("anlage: " + anlage);
        buf.append("\ntype: " + type);
        buf.append("\nkw:" + kw);

        return buf.toString();
    }
}
