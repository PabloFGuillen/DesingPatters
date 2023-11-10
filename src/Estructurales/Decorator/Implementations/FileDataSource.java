package Estructurales.Decorator.Implementations;

import Estructurales.Decorator.Interface.DataSource;

public class FileDataSource implements DataSource {

    String fileName;
    public FileDataSource(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) {

    }

    @Override
    public void readData() {

    }
}
