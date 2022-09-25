package adapter;

public class NxenesToStudentAdapter implements Student{
    private Nxenesi nxenes;

    public NxenesToStudentAdapter(Nxenesi nxenes) {
        this.nxenes = nxenes;
    }

    @Override
    public double getGrade() {
        return this.nxenes.getMark();
    }

    @Override
    public void fullName() {
        System.out.println(this.nxenes.getName() + " " + this.nxenes.getSurname());
    }
}
