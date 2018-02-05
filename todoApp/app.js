angular.module('todoList', [])
.controller('TodoCtrl', function($scope) {
    var self = this;

    self.listItem = {};

    self.items = [];

    for (var i = 1; i <= self.items; i++) {
        self.items.push({
            title: 'Item ' + i,
            checked: false
        });
    }

    self.isCheckedAll = false;    

    self.toggleCheckbox = function() {
        self.isCheckedAll = !self.isCheckedAll;
        angular.forEach(self.items, function(v, k) {            
            v.checked = self.isCheckedAll;            
        });      
    };

    self.addItem = function() {
        if (self.listItem.title == '' || !self.listItem.title) {
            alert('Please enter title');
            return false;
        }
        self.items.unshift(angular.copy(self.listItem));
        self.listItem = {};
    };

    self.deleteItems = function() {        
        if (confirm('Are you sure to delete seleted item(s)?')) {
            var tmp = [];
            angular.forEach(self.items, function(v, k) {
                if (!v.checked) {
                    tmp.push(v);
                }
            });
            self.items = tmp;
        }
    };

   self.removeItem = function(index) {
        if (confirm('Are you sure to delete this item?')) {
            self.items.splice(index, 1);
        }
    };
});



