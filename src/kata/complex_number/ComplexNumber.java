package kata.complex_number;

import java.util.Objects;

public class ComplexNumber {
    double re;
    double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public int hashCode() {
        Objects.hash(re, im);
        return (int) (re*im*128);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        if (this == obj){
            return true;
        }
        ComplexNumber complexNumber = (ComplexNumber) obj;
        return (Double.compare(re, complexNumber.re) == 0)
                && ((Double.compare(im, complexNumber.im)) == 0);
    }
}
