var intervalID = window.setInterval(callBed1Rate, 1000);

function callBed1Rate()
{
    $.ajax
    ({
        url: 'Bed1Module',
        type: 'GET',
        dataType: 'text'
    }).done(function(data) 
    {
        var values = String(data);
        var splittedValues = values.split(",");
        document.getElementById('pulse1').innerHTML = splittedValues[0];
        document.getElementById('pulseBed1').innerHTML = splittedValues[0];
        document.getElementById('breathing1').innerHTML = splittedValues[1];
        document.getElementById('bloodSystolic1').innerHTML = splittedValues[2];
        document.getElementById('bloodDiastolic1').innerHTML = splittedValues[3];
        document.getElementById('temperature1').innerHTML = splittedValues[4];
        document.getElementById('temperatureBed1').innerHTML = splittedValues[4];
    });
}
