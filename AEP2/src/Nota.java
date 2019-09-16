class Nota {

    private String id;
    private float nota;
    private String avaliacao;
    private String aluno;

    public void Nota(float nota, String avaliacao) {
        this.nota = nota;
        this.avaliacao = avaliacao;
    }

    public void setNota(float nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            throw new RuntimeException("Nota Inválida, valores entra 0 e 10 s");
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