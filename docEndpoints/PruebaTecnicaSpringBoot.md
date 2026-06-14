Documentación en la web: https://ed-cesar-burgos-8898624.postman.co/workspace/Personal-Workspace~539ac8c5-2dfc-48ce-b645-719c6e96cb4f/collection/55125712-2cf984ef-262b-445f-ba24-55e2cedc9a5d?action=share&creator=55125712

# Project: PruebaTecnicaSpringBoot
Documentación correspondiente a la prueba Técnica hecha con SpringBoot de Java
# 📁 Collection: Adoptantes 
Folder que contiene la documentación correspondiente a los endpoints de adoptantes. 


## End-point: 1) Registrar Adoptante
### Method: POST
>```
>http://localhost:8090/api/adoptantes
>```
### Body (**raw**)

```json
{
    "nombre": "Carlos",
    "apellidoPaterno": "Sanchez",
    "apellidoMaterno": "Gonzalez",
    "telefono": "4771234567",
    "correo": "carlos@gmail.com"
}
```

### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "idAdoptante": 6,
    "nombre": "Carlos",
    "apellidoPaterno": "Sanchez",
    "apellidoMaterno": "Gonzalez",
    "telefono": "4771234567",
    "correo": "carlos@gmail.com",
    "fechaRegistro": null,
    "estado": 1
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: 2) Lista de adoptantes
Endpoint obligatorio que retorna la lista de adoptantes registrados
### Method: GET
>```
>http://localhost:8090/api/adoptantes
>```
### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
[]
```
</details>

### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "ok",
    "data": [
        {
            "idAdoptante": 6,
            "nombre": "Carlos",
            "apellidoPaterno": "Sanchez",
            "apellidoMaterno": "Gonzalez",
            "telefono": "4771234567",
            "correo": "carlos@gmail.com",
            "fechaRegistro": null,
            "estado": 1
        },
        {
            "idAdoptante": 7,
            "nombre": "Carlos",
            "apellidoPaterno": "Sanchez",
            "apellidoMaterno": "Gonzalez",
            "telefono": "4771234567",
            "correo": "carlos@gmail.com",
            "fechaRegistro": null,
            "estado": 1
        },
        {
            "idAdoptante": 8,
            "nombre": "Juan",
            "apellidoPaterno": "Perez",
            "apellidoMaterno": "Lopez",
            "telefono": "4771234567",
            "correo": "carlos@gmail.com",
            "fechaRegistro": null,
            "estado": 1
        }
    ]
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: 3) Adoptante ID
### Method: GET
>```
>undefined
>```
### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "ok",
    "data": {
        "idAdoptante": 6,
        "nombre": "Carlos",
        "apellidoPaterno": "Sanchez",
        "apellidoMaterno": "Gonzalez",
        "telefono": "4771234567",
        "correo": "carlos@gmail.com",
        "fechaRegistro": null,
        "estado": 1
    }
}
```
</details>

### Response: 404
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": false,
    "mensaje": "No se encontró consultante",
    "data": null
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: 4) Actualizando info
### Method: PUT
>```
>http://localhost:8090/api/adoptantes/8
>```
### Body (**raw**)

```json
{
"nombre": "Juan EDITADO",
"apellidoPaterno": "Sanchez EDITADO",
"apellidoMaterno": "Gonzalez EDITADO",
"telefono": "1111111",
"correo": "carlosEDITADO@gmail.com"
}
```

### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "ok",
    "data": {
        "idAdoptante": 8,
        "nombre": "Juan EDITADO",
        "apellidoPaterno": "Sanchez EDITADO",
        "apellidoMaterno": "Gonzalez EDITADO",
        "telefono": "1111111",
        "correo": "carlosEDITADO@gmail.com",
        "fechaRegistro": null,
        "estado": 1
    }
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: 5) Eliminacion
### Method: DELETE
>```
>http://localhost:8090/api/adoptantes/6
>```
### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "ok",
    "data": null
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Mascotas 
Contiene los endpointas acerca del procesamiento de la información de las mascotas 


## End-point: 1) Registrar Mascota
### Method: POST
>```
>http://localhost:8090/api/mascotas
>```
### Body (**raw**)

```json
{
    "idadoptante":1,
    "nombre": "pinky",
    "especie":"canino",
    "raza":"chihuahua",
    "sexo":"M"
}
```

### Response: 400
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": false,
    "mensaje": "Debe ingresar un ID adoptante valido",
    "data": null
}
```
</details>

### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "ok",
    "data": {
        "idMascota": 1,
        "idAdoptante": {
            "idAdoptante": 7,
            "nombre": "Carlos",
            "apellidoPaterno": "Sanchez",
            "apellidoMaterno": "Gonzalez",
            "telefono": "4771234567",
            "correo": "carlos@gmail.com",
            "fechaRegistro": null,
            "estado": 1
        },
        "nombre": "pinky",
        "especie": "canino",
        "raza": "chihuahua",
        "sexo": "M",
        "fechaNacimiento": null,
        "peso": null,
        "color": null,
        "estado": 1
    }
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: 2) Buscar Mascotas Por Consultante
### Method: GET
>```
>http://localhost:8090/api/mascotas/adoptante/6
>```
### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "ok",
    "data": []
}
```
</details>

### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "ok",
    "data": [
        {
            "idMascota": 1,
            "idAdoptante": {
                "idAdoptante": 7,
                "nombre": "Carlos",
                "apellidoPaterno": "Sanchez",
                "apellidoMaterno": "Gonzalez",
                "telefono": "4771234567",
                "correo": "carlos@gmail.com",
                "fechaRegistro": null,
                "estado": 1
            },
            "nombre": "pinky",
            "especie": "canino",
            "raza": "chihuahua",
            "sexo": "M",
            "fechaNacimiento": null,
            "peso": null,
            "color": null,
            "estado": 1
        }
    ]
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Dispositivo 
Contiene los endpoints que interacturarán con la información de los dispositivos 


## End-point: 1) Registrar
### Method: POST
>```
>http://localhost:8090/api/dispositivosMascotas
>```
### Body (**raw**)

```json
{
    "idMascota":2,
    "numeroChip": "ADD211",
    "tipoDispositivo":"Microchip"
}
```

### Response: 400
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": false,
    "mensaje": "No existe la mascota",
    "data": null
}
```
</details>

### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "ok",
    "data": {
        "idDispositivo": 1,
        "idMascota": {
            "idMascota": 1,
            "idAdoptante": {
                "idAdoptante": 7,
                "nombre": "Carlos",
                "apellidoPaterno": "Sanchez",
                "apellidoMaterno": "Gonzalez",
                "telefono": "4771234567",
                "correo": "carlos@gmail.com",
                "fechaRegistro": null,
                "estado": 1
            },
            "nombre": "pinky",
            "especie": "canino",
            "raza": "chihuahua",
            "sexo": "M",
            "fechaNacimiento": null,
            "peso": null,
            "color": null,
            "estado": 1
        },
        "numChip": "ADD211",
        "tipoDispositivo": "Microchip",
        "fechaInstalacion": "2026-06-14T02:42:05.5971139",
        "estado": 1
    }
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: 2) Lista de dispositivos
### Method: GET
>```
>undefined
>```
### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "ok",
    "data": []
}
```
</details>

### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "ok",
    "data": [
        {
            "idDispositivo": 1,
            "idMascota": {
                "idMascota": 1,
                "idAdoptante": {
                    "idAdoptante": 7,
                    "nombre": "Carlos",
                    "apellidoPaterno": "Sanchez",
                    "apellidoMaterno": "Gonzalez",
                    "telefono": "4771234567",
                    "correo": "carlos@gmail.com",
                    "fechaRegistro": null,
                    "estado": 1
                },
                "nombre": "pinky",
                "especie": "canino",
                "raza": "chihuahua",
                "sexo": "M",
                "fechaNacimiento": null,
                "peso": null,
                "color": null,
                "estado": 1
            },
            "numChip": "ADD211",
            "tipoDispositivo": "Microchip",
            "fechaInstalacion": "2026-06-14T02:42:05",
            "estado": 1
        }
    ]
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Vacuna 
Contiene los endpoints que interactuarán con la información de las vacunas 


## End-point: 1) Registrar Vacuna
### Method: POST
>```
>http://localhost:8090/api/vacunaMascotas
>```
### Body (**raw**)

```json
{
    "idMascota":2,
    "nombre": "parvovirus",
    "veterinarioResponsable":"Jose Herrera"
}
```

### Response: 400
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": false,
    "mensaje": "No se encontró a la mascota",
    "data": null
}
```
</details>

### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "ok",
    "data": {
        "idVacuna": 1,
        "idMascota": {
            "idMascota": 1,
            "idAdoptante": {
                "idAdoptante": 7,
                "nombre": "Carlos",
                "apellidoPaterno": "Sanchez",
                "apellidoMaterno": "Gonzalez",
                "telefono": "4771234567",
                "correo": "carlos@gmail.com",
                "fechaRegistro": null,
                "estado": 1
            },
            "nombre": "pinky",
            "especie": "canino",
            "raza": "chihuahua",
            "sexo": "M",
            "fechaNacimiento": null,
            "peso": null,
            "color": null,
            "estado": 1
        },
        "nombreVacuna": "parvovirus",
        "fechaAplicacion": "2026-06-14T10:30:00",
        "fechaProximaDosis": "2027-06-14T10:30:00",
        "veterinarioResponsable": null,
        "estado": 1
    }
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: 2) Historial de vacunas
### Method: GET
>```
>undefined
>```
### Response: 404
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": false,
    "mensaje": "No se encontró la mascota",
    "data": null
}
```
</details>

### Response: 200
<details open style="width: fit-content; max-height: 600px; overflow: auto">
<summary>Response example:</summary>

```json
{
    "success": true,
    "mensaje": "ok",
    "data": {
        "idVacuna": 1,
        "idMascota": {
            "idMascota": 1,
            "idAdoptante": {
                "idAdoptante": 7,
                "nombre": "Carlos",
                "apellidoPaterno": "Sanchez",
                "apellidoMaterno": "Gonzalez",
                "telefono": "4771234567",
                "correo": "carlos@gmail.com",
                "fechaRegistro": null,
                "estado": 1
            },
            "nombre": "pinky",
            "especie": "canino",
            "raza": "chihuahua",
            "sexo": "M",
            "fechaNacimiento": null,
            "peso": null,
            "color": null,
            "estado": 1
        },
        "nombreVacuna": "parvovirus",
        "fechaAplicacion": "2026-06-14T10:30:00",
        "fechaProximaDosis": "2027-06-14T10:30:00",
        "veterinarioResponsable": null,
        "estado": 1
    }
}
```
</details>


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
_________________________________________________
Powered By: [postman-to-markdown](https://github.com/bautistaj/postman-to-markdown/)
