package Estructurales.Decorator.Implementations;

import Estructurales.Decorator.Interface.DataSource;

import javax.xml.crypto.Data;

public class DataSourceDecorator implements DataSource {

    private DataSource wrappee;

    public DataSourceDecorator(DataSource wrappee){
        this.wrappee = wrappee;
    }

    @Override
    public void writeData(String data) {

    }

    @Override
    public void readData() {

    }
}
