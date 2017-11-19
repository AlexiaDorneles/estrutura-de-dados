/**
 * @author Aléxia Dorneles <alexiadorneles02@gmail.com>
 */
class Graph {
  constructor() {
    this.adicionarVertice = this.adicionarVertice.bind(this)
    this.adicionarAresta = this.adicionarAresta.bind(this)

    this.vertices = []
    this.arestas = []
  }

  adicionarVertice(nomeVertice) {
    const verticeNaLista = this.vertices.find(v => v.nome === nomeVertice)
    if (!!verticeNaLista) {
      return verticeNaLista
    }
  	const tamanhoVertices = this.vertices.length
  	const vertice = new Vertice(tamanhoVertices, nomeVertice)


  	this.vertices.push(vertice)
  	this.arestas.push(this.vertices.map(v => new Aresta(null, null)))

  	for (let i = 0; i < tamanhoVertices; ++i) {
      const teste = this.vertices.map(v => new Aresta(null, null))
      teste.forEach(a => {
        this.arestas[i].push([a])
      })
    }

  	return vertice
  }

  adicionarAresta(valor, verticeOrigem, verticeDestino) {
  	const i = verticeOrigem.id, j = verticeDestino.id

  	this.arestas[i][j].verticeOrigem = verticeOrigem
  	this.arestas[i][j].verticeDestino = verticeDestino
  	this.arestas[i][j].valor = valor

  	this.arestas[j][i].verticeOrigem = verticeDestino
  	this.arestas[j][i].verticeDestino = verticeOrigem
  	this.arestas[j][i].valor = valor

  	return this.arestas[i][j]
  }

  getArestaValue(verticeOrigem, verticeDestino) {
    const i = verticeOrigem.id, j = verticeDestino.id
    const aresta = this.arestas[i][j]
    if (!!aresta) {
      return !!aresta.valor ? aresta.valor : 0
    }
    return 0
  }

}
