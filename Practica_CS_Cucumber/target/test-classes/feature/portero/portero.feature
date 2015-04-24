Feature: Estadísticas de un portero
  
  Scenario: Estadísticas de un portero
    Given un portero con salidas 30, manoAmano 89, reflejos 87, penaltis 78
    When el cliente cree un portero con los datos anteriores
    Then Portero debe tener reflejos 87