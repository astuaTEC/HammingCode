package sample;

public class Binary {
    public void setBinaryValue(String binaryValue) {
        this.binaryValue = binaryValue;
        this.octal = 0;
        this.decimal = 0;
        this.hexadecimal = null;
    }

    public String binaryValue;
    public double octal;
    public int decimal;
    public String hexadecimal;

    public Binary(String value){
        binaryValue = value;
    }

    public void setHexadecimal(String hexadecimal) {
        this.hexadecimal = hexadecimal;
    }
    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }
    public double getOctal() {
        return octal;
    }
    public void setOctal(double octal) {
        this.octal = octal;
    }
    public String getHexadecimal() {
        return hexadecimal;
    }
    public int getDecimal() {
        return decimal;
    }

    boolean esBinario(String value) {

        for(int i = 0; i < value.length(); i++) {
            int tempB = value.charAt(i);
            if (tempB != '0' && tempB != '1') {
                return false;
            }
        }
        // no failures, so
        return true;
    }

    public void conversion(){
        int longitud = binaryValue.length();
        int i = 0, temp, temp2;
        int octal_num[] = new int[100];

        if (longitud == 12 && esBinario(binaryValue)) {
            setDecimal(Integer.parseInt(binaryValue, 2));
            System.out.println("El en numero decimal es:" + getDecimal());
            temp = getDecimal();
            temp2 = getDecimal();
            while (temp != 0) {
                octal_num[i] = temp % 8;
                temp = temp / 8;
                i++;
            }
            for (int j = i; j >= 0; j--) {
                setOctal(octal + octal_num[j] * Math.pow(10, j));
            }
            System.out.println("El numero en octal es:" + getOctal());
            setHexadecimal(Integer.toHexString(temp2));
            System.out.println("El numero en hexadecimal es:" + getHexadecimal());
        }
        else{
            System.out.printf("debe ingresar un numero binario con 12 caracteres");
        }

    }
}

