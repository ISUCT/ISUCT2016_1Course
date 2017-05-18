package Calculator;

import java.io.Serializable;

/**
 * Created by maxim-mac on 18/05/2017.
 */
public class FileMaskGUI implements Serializable {
    private double xnStr;
    private double xkStr;
    private double dxStr;
    private String xStr;
    private String xLabelStr;
    private String xResStr;

    public double getXnStr() {
        return xnStr;
    }

    public void setXnStr(double xnStr) {
        this.xnStr = xnStr;
    }

    public double getXkStr() {
        return xkStr;
    }

    public void setXkStr(double xkStr) {
        this.xkStr = xkStr;
    }

    public double getDxStr() {
        return dxStr;
    }

    public void setDxStr(double dxStr) {
        this.dxStr = dxStr;
    }

    public String getxStr() {
        return xStr;
    }

    public void setxStr(String xStr) {
        this.xStr = xStr;
    }

    public String getxLabelStr() {
        return xLabelStr;
    }

    public void setxLabelStr(String xLabelStr) {
        this.xLabelStr = xLabelStr;
    }

    public String getxResStr() {
        return xResStr;
    }

    public void setxResStr(String xResStr) {
        this.xResStr = xResStr;
    }

    public FileMaskGUI(double x1, double x2, double x3, String x4, String x5, String x6) {
        xnStr = x1;
        xkStr = x2;
        dxStr = x3;
        xStr = x4;
        xLabelStr = x5;
        xResStr = x6;
    }
}
