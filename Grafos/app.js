/**
 * @author Aléxia Dorneles <alexiadorneles02@gmail.com>
 */
var myApp = angular.module('app',[]);

myApp.controller('GeneralController', ['$scope', function($scope) {
  const model = new Graph()

  const adicionar = ({ valorAresta, verticeOrigem, verticeDestino }) => {
    model.adicionarAresta(
      valorAresta,
      model.adicionarVertice(verticeOrigem),
      model.adicionarVertice(verticeDestino)
    )
  }

  const getValores = (vertice) => {
    return model.vertices.map(v => model.getArestaValue(vertice, v))
  }

  $scope.adicionar = adicionar
  $scope.getValores = getValores
  $scope.grafo = {}
  $scope.vertices = model.vertices
}])
