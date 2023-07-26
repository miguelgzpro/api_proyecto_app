from django.db import models

class TipoPersona(models.Model):
    nombre = models.CharField(max_length=100)

class Persona(models.Model):
    nombre = models.CharField(max_length=80)
    codigo = models.CharField(max_length=80)
    nro_credito = models.IntegerField()
    TipoPersona = models.ForeignKey(TipoPersona, on_delete=models.PROTECT)

# otros modelos...
