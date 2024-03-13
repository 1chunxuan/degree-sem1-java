/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Tang Chun Xuan
 */
public class Product implements Comparable<Product> {

    private int code;
    private String name;

    public Product(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.code;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        return this.code == other.code;
    }

    @Override
    public String toString() {
        return code + " \t" + name;
    }

    @Override
    public int compareTo(Product o) {
        //for sorting according the code of product
//        if(this.code>o.code){
//            return 1;
//        }
//        else if(this.code==o.code){
//            return 0;
//        }else{
//            return -1;
//        }

        return this.name.compareTo(o.name);
    }

}
