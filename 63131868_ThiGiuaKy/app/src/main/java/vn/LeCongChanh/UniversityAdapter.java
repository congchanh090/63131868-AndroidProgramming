package vn.LeCongChanh;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UniversityAdapter extends RecyclerView.Adapter<UniversityAdapter.UniversityViewHolder> {

    Context context;

    ArrayList<University> datas;

    public UniversityAdapter(Context _context, ArrayList<University> _datas) {
        this.context = _context;
        this.datas = _datas;
    }

    @NonNull
    @Override
    public UniversityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View viewItem = layoutInflater.inflate(R.layout.activity_university, parent, false);
        UniversityViewHolder viewHolder = new UniversityViewHolder(viewItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UniversityViewHolder holder, int position) {
        //Lấy phần tử ở vị trí position của nguồn dữ liệu
        University univerSity = datas.get(position);

        //Đặt vào các thuộc tính hiển thị của view con
        //Đặt tên
        holder.universityCaption.setText(univerSity.getUniversityName());
        //Đặt ảnh
        String packageName = holder.itemView.getContext().getPackageName();
        //Lấy id ảnh thông qua tên
        String nameFile = univerSity.getUniversityImage();
        int imageID = holder.itemView.getResources().getIdentifier(nameFile, "mipmap", packageName);
        holder.universityImage.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    final class UniversityViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView universityCaption;
        ImageView universityImage;

        public UniversityViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            universityImage = itemView.findViewById(R.id.ivUniversity);
            universityCaption = itemView.findViewById(R.id.tvCaption);
        }

        @Override
        public void onClick(View v) {
            //Lấy vị trí item được click thông qua phương thức getAdapterPosition()
            int clickedPosition = getAdapterPosition();
            //Lấy dữ liệu tương ứng từ danh sách (theo vị trí)
            University univerSity = datas.get(clickedPosition);
            //Hiện thông báo hoặc các sự kiện khác
            Toast.makeText(v.getContext(), "Bạn đã lựa chọn: " + univerSity.getUniversityName(), Toast.LENGTH_SHORT).show();
        }
    }
}
