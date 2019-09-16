class Aluno {

    private String id;
    private float nota;
    private String avaliacao;
    private String aluno;

    public Aluno (String aluno, String avaliacao) {
        this.aluno = aluno;
        this.avaliacao = avaliacao;
    }

    public void setNota(float nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            throw new RuntimeException("Aluno Invalido.");
        }
    }
    public float getNota() {
        return this.nota;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return this.id;
    }

}