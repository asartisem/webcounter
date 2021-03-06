(function () {
    window.Operations = {};

    var self = Operations;

    self.increment = function () {
        $.ajax({
            url: URLs.counterUrl,
            type: 'POST',
            success: function (result) {
                if (result.success) {
                    incrementValue();
                }
            }
        });
    };

    self.decrement = function () {
        $.ajax({
            url: URLs.counterUrl,
            type: 'DELETE',
            success: function (result) {
                if (result.success) {
                    decrementValue();
                }
            }
        });
    };

    function incrementValue() {
        var elemValue = $("#countValue");
        var value = Number(elemValue.text());
        elemValue.text(++value);
    }

    function decrementValue() {
        var elemValue = $("#countValue");
        var value = Number(elemValue.text());
        elemValue.text(--value);
    }

})();
