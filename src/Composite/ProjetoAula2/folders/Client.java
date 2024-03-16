package Composite.ProjetoAula2.folders;

import Composite.ProjetoAula2.folders.model.FileItem;
import Composite.ProjetoAula2.folders.model.Folder;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

    public static FileItem createCompositeFromFile(File file) {
        if (!file.isDirectory()) return new Composite.ProjetoAula2.folders.model.File(file.getName());

        List<FileItem> childs = new ArrayList<>();
        File[] files= file.listFiles();

        for (File javaFile : files) {
            childs.add(createCompositeFromFile(javaFile));
        }

        return new Folder(file.getName(), childs);
    }

    public static void main(String[] args) {
        FileItem file1 = new Composite.ProjetoAula2.folders.model.File("Texto1.txt");
        FileItem file2 = new Composite.ProjetoAula2.folders.model.File("Texto2.txt");
        FileItem file3 = new Composite.ProjetoAula2.folders.model.File("Texto3.txt");
        FileItem file4 = new Composite.ProjetoAula2.folders.model.File("Texto4.txt");
        FileItem sf1 = new Folder("sf1", Arrays.asList(file1));
        FileItem sf2 = new Folder("sf2", Arrays.asList(file2, sf1));
        FileItem folder = new Folder("folder", Arrays.asList(sf2, file3, file4));

        folder.print("");

        System.out.println("-------------");

        String dir = System.getProperty("user.dir");
        FileItem fromDisk = createCompositeFromFile(new File(dir + File.separator + "src"));
        fromDisk.print(">");
    }

}
