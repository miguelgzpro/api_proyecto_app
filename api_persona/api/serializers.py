from rest_framework import serializers
from api.models import Persona, TipoPersona

class TipoPersonaSerializer (serializers.ModelSerializer):
    class Meta:
        model = TipoPersona
        fields = "__all__"

class PersonaSerializer (serializers.ModelSerializer):
    class Meta:
        model = Persona
        fields = "__all__"
       
