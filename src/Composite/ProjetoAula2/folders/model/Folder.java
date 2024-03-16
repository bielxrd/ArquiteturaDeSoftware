package Composite.ProjetoAula2.folders.model;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileItem {

    private String name;

    private List<FileItem> childs;

    public Folder(String name, List<FileItem> childs) {
        this.name = name;
        this.childs = childs;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + name);

        for (FileItem child : childs) {
            child.print(structure + "| ");
        }
    }
}
