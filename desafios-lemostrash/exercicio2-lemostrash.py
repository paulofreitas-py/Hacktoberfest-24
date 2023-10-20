class PatoDeBorracha:
    def __init__(self, cor, tamanho, peso):
        self.cor = cor
        self.tamanho = tamanho
        self.peso = peso

    def emitirSom(self):
        print("Quack! Quack!")

    def flutuar(self):
        print("Está flutuando na água.")

    def esguicharAgua(self):
        print("Esguichando água!")


meu_pato = PatoDeBorracha("amarelo", "pequeno", "leve")
meu_pato.emitirSom()
meu_pato.flutuar()
meu_pato.esguicharAgua()
