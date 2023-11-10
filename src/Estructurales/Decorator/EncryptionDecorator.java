package Estructurales.Decorator;

import Estructurales.Decorator.Implementations.DataSourceDecorator;
import Estructurales.Decorator.Interface.DataSource;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void readData(){

    }

    @Override
    public void writeData(String data) {
        super.writeData(data);
    }
}
