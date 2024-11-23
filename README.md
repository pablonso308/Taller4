# Taller 4 - Android Application

## Descripción
 link a mi repositorio:https://github.com/pablonso308/Taller4.git
Este proyecto es una aplicación Android desarrollada como parte del Taller 4. Utiliza Kotlin como lenguaje de programación principal y sigue una arquitectura modular con soporte para widgets y actividades dinámicas.

## Características

- **Actividades y Fragmentos:**
  - Actividad principal (`MainActivity`) para la navegación básica.
  - Actividad de pantalla adicional (`ScreenActivity`).
  - Fragmentos:
    - `ListFragment`: Muestra una lista de elementos.
    - `DetailFragment`: Proporciona detalles de un elemento seleccionado.

- **Widgets:**
  - Proveedor de widgets (`WidgetProvider`) con soporte de configuración y vistas personalizadas.
  - Servicio de widgets para actualizaciones dinámicas (`WidgetService`).

- **Sensores:**
  - Integración con sensores del dispositivo mediante la actividad `SensorActivity`.

- **Temas y UI Personalizada:**
  - Uso de temas y esquemas de colores definidos en `ui/theme`.
  - Diseño responsivo y dinámico en XML.

## Estructura del Proyecto

```plaintext
Taller4-master/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/taller4/
│   │   │   │   ├── fragments/     # Fragmentos del proyecto
│   │   │   │   ├── sensor/        # Actividades relacionadas con sensores
│   │   │   │   ├── ui/theme/      # Temas y estilos de UI
│   │   │   │   ├── widget/        # Código relacionado con widgets
│   │   │   │   └── MainActivity.kt, ScreenActivity.kt # Actividades principales
│   │   │   ├── res/               # Recursos de diseño (layouts, drawables, strings, etc.)
│   │   │   └── AndroidManifest.xml
│   └── build.gradle.kts           # Configuración Gradle del módulo app
├── build.gradle.kts               # Configuración general del proyecto
├── gradle/                        # Configuración Gradle
├── gradlew, gradlew.bat           # Scripts para Gradle Wrapper
└── settings.gradle.kts            # Configuración de módulos del proyecto
