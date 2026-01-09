# Sistema de Reservación de Asientos (Java)

Proyecto desarrollado en **Java** que simula un sistema básico de **reservación y liberación de asientos** utilizando **matrices bidimensionales**, con interacción por consola.

Reforzando conceptos fundamentales como:
- Programación Orientada a Objetos (POO)
- Uso de matrices
- Separación de responsabilidades
- Validaciones
- Lógica de negocio

---

## Funcionalidades

Mostrar el estado de los asientos  
Reservar un asiento específico  
Liberar un asiento  
Contador de asientos libres y ocupados  
Validación de posiciones inválidas  
Representación visual de asientos:
- **L** → Libre  
- **O** → Ocupado  

---

## Conceptos aplicados

- Matrices bidimensionales (`int[][]`)
- Encapsulamiento
- Clases y paquetes (`model`, `service`, `ui`)
- Métodos y control de flujo
- Validaciones defensivas
- Contadores dinámicos

---

## Estructura del proyecto
src/
└── com.yael.asientos
├── model
│ └── Asiento.java
├── service
│ └── AsientoService.java
└── ui
└── Principal.java
