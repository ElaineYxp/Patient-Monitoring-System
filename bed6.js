var intervalID = window.setInterval(callBed6Rate, 1000);

function callBed6Rate()
{
    $.ajax
    ({
        url: 'Bed6Module',
        type: 'GET',
        dataType: 'text'
    }).done(function(data) 
    {
        var values = String(data);
        var splittedValues = values.split(",");
        document.getElementById('pulse6').innerHTML = splittedValues[0];
        document.getElementById('pulseBed6').innerHTML = splittedValues[0];
        document.getElementById('breathing6').innerHTML = splittedValues[1];
        document.getElementById('bloodSystolic6').innerHTML = splittedValues[2];
        document.getElementById('bloodDiastolic6').innerHTML = splittedValues[3];
        document.getElementById('temperature6').innerHTML = splittedValues[4];
        document.getElementById('temperatureBed6').innerHTML = splittedValues[4];
    });
}
