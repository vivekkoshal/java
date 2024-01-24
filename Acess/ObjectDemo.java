package Acess;

public class ObjectDemo {
    @Override //hashcode gives unique value to every object created
    public int hashCode() {
        return super.hashCode();
    }

    @Override //.equal() is used to compare each variable of the objects
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // used to print the string for object
    public String toString() {
        return super.toString();
    }

    @Override //called when the grabage collect hits
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
