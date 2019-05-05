package dev.wesleysantos.daogenerator;

import org.greenrobot.greendao.generator.DaoGenerator;
import org.greenrobot.greendao.generator.Entity;
import org.greenrobot.greendao.generator.Schema;

public class MyDaoGenerator {
    private static final String PACKAGE = "dev.wesleysantos.database.gen";

    public static void main(String[] args) throws Exception {
        Schema schema = new Schema(1, PACKAGE);
        Entity phrases = schema.addEntity("Phrases");
        phrases.setSuperclass("dev.wesleysantos.database.cipher.PhrasesWithEncryption");
        phrases.implementsSerializable();
        phrases.addIntProperty("id").primaryKey();
        phrases.addStringProperty("phrase");

        schema.enableKeepSectionsByDefault();
        schema.enableActiveEntitiesByDefault();

        new DaoGenerator().generateAll(schema, args[0]);
    }
}
