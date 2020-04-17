import random

def ModeMedian(liste):
    n = len(liste)
    for i in range(n-1,-1,-1):
        for j in range(0,i):
            if liste[j] > liste[j+1] :
            	liste[j], liste[j+1] = liste[j+1], liste[j]
    
    if(n%2==0): #median karmaşıklığı
        median1=liste[n//2]
        median2=liste[n//2 - 1]
        median=(median1+median2)/2
        
    else:
        median=liste[n//2]
    
   for key in sayac.keys(): #Mod karmaşıklığı
        if sayac[key]>max:
            max=sayac[key]
            mode=key
    return median,mode

liste=[2,-4,5,6,9,10,5,-9,1,0]
sayac={}
max=-1
median,mode=getModeMedian(liste)
print("median: {}" + median	+ "mode: {}" +mode)

