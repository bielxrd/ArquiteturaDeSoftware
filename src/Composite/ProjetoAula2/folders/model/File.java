package Composite.ProjetoAula2.folders.model;

public class File implements FileItem {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + name);
    }
}
