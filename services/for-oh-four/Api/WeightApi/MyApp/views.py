from django.shortcuts import render
from django.http import Http404
from rest_framework.views import APIView
from rest_framework.decorators import api_view
from rest_framework import status
from django.http import JsonResponse
from django.core import serializers
from django.conf import settings
import Json

# Create your views here.
@api_view(["Post"])
def MoonWeight(Earth_Weight):

        Eweight=json.loads(Earth_Weight.body)
        Mweight = (Eweight/9.81) * 1.622

        return JsonResponse("If you were on the moon you would weigh " + Mweight + "pounds",safe = False)
