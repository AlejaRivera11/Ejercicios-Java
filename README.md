# Taller de Refuerzo 
## GIT

1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?  
Un repositorio en Git es un lugar donde puedes almacenar el código, los archivos y el historial de revisiones de cada archivo. Los repositorios pueden contar con múltiples colaboradores, pueden ser públicos como privados y permite volver a versiones anteriores del código.  
Además es una carpeta de proyecto que contiene un subdirectorio oculto llamado .git donde se guarda todo el historial, configuración y metadatos del control de versiones.  
La diferencia entre con un Proyecto “normal”, es que este solo es una carpeta con archivos; no tiene control de versiones ni historial.

2. ¿Cuáles son las tres áreas principales de Git (working directory, staging area/index y repository) y qué papel cumple cada una?
- **Working directory (Directorio de trabajo):** es la copia local de los archivos del proyecto en la máquina. Aquí es donde se realizan modificaciones, crear nuevos archivos o eliminar los que ya no son necesarios. Estos cambios son detectados por Git, pero aún no forman parte del historial oficial hasta que son confirmados.  
- **Staging área / Index:** es una zona intermedia que almacena temporalmente los cambios que se desean incluir en el próximo commit. Al usar git add, se añade archivos o modificaciones específicas a esta área. Esto permite seleccionar de manera precisa qué cambios serán confirmados, facilitando la organización y claridad en el historial de versiones.  
- **Repository (Repositorio local):** es la base de datos interna donde Git guarda todos los commits y el historial completo del proyecto. Cuando se ejecuta git commit, los cambios almacenados en la staging area se registran de forma permanente en el repositorio local. Cada commit incluye un snapshot de los archivos en ese momento, junto con información sobre el autor y un mensaje descriptivo.  

3. ¿Cómo representa Git los cambios internamente? (objetos blob, tree, commit y tag).
4. ¿Cómo se crea un commit y qué información almacena un objeto commit?
5. ¿Cuál es la diferencia entre git pull y git fetch?
6. ¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits?
7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?
8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?
9. ¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?
10. ¿Cuál es la diferencia entre un “commit amend” (--amend) y un nuevo commit?
11. ¿Cómo se utiliza git stash y en qué escenarios es útil?
12. ¿Qué mecanismos ofrece Git para deshacer cambios (por ejemplo, git reset, git revert, git checkout)?
13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para gestión de forks?
14. ¿Cómo puedo inspeccionar el historial de commits (por ejemplo, git log, git diff, git show)?

## Programación

16. ¿Cuáles son los tipos de datos primitivos en Java?
17. ¿Cómo funcionan las estructuras de control de flujo como if, else, switch y bucles en Java?
18. ¿Por qué es importante usar nombres significativos para variables y métodos?
19. ¿Qué es la Programación Orientada a Objetos (POO)?
20. ¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos?
21. ¿Qué es la herencia en POO y cómo se utiliza en Java?
22. ¿Qué son los modificadores de acceso y cuáles son los más comunes en Java?
23. ¿Qué es una variable de entorno y por qué son importantes para Java o la programación en general?


